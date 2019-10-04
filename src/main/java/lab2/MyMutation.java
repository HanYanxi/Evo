package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!
        double mutationRate1=0.05;//染色体变异概率
        double mutationRate2= 0.5;//基因变异概率
        int individuals_size = population.get(0).length;//取种群中第一个元素的长度，也就是取一个染色体（individuals=solution）的长度
        if (random.nextDouble() < mutationRate1) {//发生基因突变的概率
                for(int i=0;i<population.size();i++){
                    //int mutationNum = (int) (random.nextDouble() * maxMutationNum);
                   if(random.nextDouble()<mutationRate2){
                       for(int j=0;j<individuals_size;j++){
                       population.get(i)[j] += random.nextGaussian();
                   }



                }

            }
            // your implementation:
        }
        //result population
        return population;
    }
}
