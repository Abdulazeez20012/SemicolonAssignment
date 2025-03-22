package LVANLT;


class Thing {
    void exist() {
        System.out.println("This is a thing.");
    }
}

class LivingThing extends Thing {
    void grow() {
        System.out.println("This living thing grows.");
    }
}


class NonLivingThing extends Thing {
    void properties() {
        System.out.println("Non-living things do not grow.");
    }
}


class Animal extends LivingThing {
    void move() {
        System.out.println("Animals can move.");
    }
}

