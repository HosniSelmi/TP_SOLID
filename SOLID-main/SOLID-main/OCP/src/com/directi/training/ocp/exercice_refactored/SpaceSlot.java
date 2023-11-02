package com.directi.training.ocp.exercice_refactored;

public class SpaceSlot implements Resource {
	int resourceId;
    @Override
    public int allocate() {
        return 0;
    }

    @Override
    public void free(int resourceId) {
        
    }
}