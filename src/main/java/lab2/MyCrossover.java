package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();
        if (p1 == null || p2 == null) { //染色体有一个为空，不产生下一代
            return null;
        }
        if (p1.length != p2.length) { //染色体基因序列长度不同，不产生下一代
            return null;
        }
        double[] c1 = new double[p1.length];
        double[] c2 = new double[p1.length];


            /*int size = c1.length;
            int a = ((int) (Math.random() * size)) % size;
            int b = ((int) (Math.random() * size)) % size;
            int min = a > b ? b : a;
            int max = a > b ? a : b;
            //对位置上的基因进行交叉互换
            for (i = min; i <= max; i++) {
                double t = c1[i];
                c1[i] = c2[i];
                c2[i] = t;
            }

        children.add(c1);
        children.add(c2);
        */

        for (i = 0; i < p1.length; i++) {
            if (random.nextDouble() < 0.3) {
                c1[i] = p2[i];
                c2[i] = p1[i];
            }
            else{
                c1[i] = p1[i];
                c2[i] = p2[i];
            }
        }

        children.add(c1);
        children.add(c2);


        // your implementation:

//        children.add(p1);
//        children.add(p2);
        return children;
    }
}
