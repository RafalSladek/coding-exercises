package com.rafalsladek.others;

public class RainDrops {

    public static void main(String[] args) {
        RainDropLinkedList drops = new RainDropLinkedList();
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());
        drops.add(getRandomDrop());

        boolean result = allDropsAreHere(drops);
//        System.out.println(drops.toString());
    }

    public static RainDropNode getRandomDrop() {
        double randomPoint = Math.abs(Math.random()) % 1;

        RainDropNode node = new RainDropNode(new Interval(randomPoint - 0.5, randomPoint + 0.5));
        System.out.println(node);
        return node;
    }

    public static boolean allDropsAreHere(RainDropLinkedList allDrops) {
        RainDropNode first = allDrops.top;
        RainDropNode second = first.next;
        if (first == null) return false;
        if (second == null) return false;


        while (first.hasIntersactionWithNext()) {
            first = first.next;
            if (first == null) {
                if (first.data.start <= 99.5) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}