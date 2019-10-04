package lab2;

import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;
//该函数是为了生成第一代染色体，就是可能的解决方案
public class MyFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        // x from -5.0 to 5.0
        for(int i = 0; i < dimension; i++){
            solution[i] = random.nextDouble() * 10 - 5.0;
        }
        //生成第一代染色体，random.nextDouble()的范围在0-1之间
        // your implementation:

        return solution;
    }
}

