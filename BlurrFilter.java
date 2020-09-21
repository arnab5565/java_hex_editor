/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amtecnologies;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

/**
 *
 * @author user
 */
public class BlurrFilter implements Template {

    @Override
    public BufferedImage processImg(BufferedImage image) {

        float[] blurrmatrix = {1.0f/9.0f, 1.0f/9.0f, 1.0f/9.0f,  1.0f/9.0f,1.0f/9.0f,1.0f/9.0f,1.0f/9.0f,1.0f/9.0f,1.0f/9.0f};
        BufferedImageOp blurrFilter = new ConvolveOp(new Kernel(3, 3, blurrmatrix),
                ConvolveOp.EDGE_NO_OP, null);

        return blurrFilter.filter(image, null);

    }
}
