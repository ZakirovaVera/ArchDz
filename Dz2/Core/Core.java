package Core;

import Abstraction.ItemGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;
import Rewards.Wood.WoodGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Core {

    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new WoodGenerator());
        // generatorList.add(...)

        int randomGeneratorNum = GetRandomInt(generatorList.size());

        ItemGenerator randomGenerator = generatorList.get(randomGeneratorNum);
        String reward = randomGenerator.openReward();
        System.out.println(reward);
    }

    public int GetRandomInt(int maxValue) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, maxValue);
        return randomNum;
    }
}
