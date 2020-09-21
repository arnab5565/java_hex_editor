/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amtecnologies;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.*;
import java.awt.image.BufferedImageOp;
import java.awt.image.Kernel;
/**
 *
 * @author user
 */
public class SharpenFilter implements Template {

    @Override
    public BufferedImage processImg(BufferedImage image) {

        float[] sharpenmatrix={0.0f,-1.0f,0.0f,-1.0f,5.0f,-1.0f,0.0f,-1.0f,0.0f};
        BufferedImageOp sharpenFilter=new ConvolveOp(new Kernel(3,3,sharpenmatrix), 
                ConvolveOp.EDGE_NO_OP, null);
        
        return sharpenFilter.filter(image, null);
//To change body of generated methods, choose Tools | Templates.

    }

}
