package Rewards.Wood;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class WoodGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new WoodRewards();
    }
}