package com.extralent.api.tools;

import net.minecraftforge.energy.EnergyStorage;

public class ETEnergyStorage extends EnergyStorage {
    public ETEnergyStorage(int capacity, int maxReceive) {
        super(capacity, maxReceive);
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void addPower(int energy) {
        int maxEnergy = this.getMaxEnergyStored();
        if (this.energy < maxEnergy) {
            this.energy += energy;
        }
    }

    public void consumePower(int energy) {
        this.energy -= energy;
        if (this.energy < 0) {
            this.energy = 0;
        }
    }
}
