public void grab(String weapon){
    System.out.println("Grabbing " + weapon);
}

public void attack(String weapon){
    System.out.println("Attacking using " + weapon);
}

public boolean walk(String direction){
    boolean isWalking = false;
    if (direction.equalsIgnoreCase("north") || direction.equalsIgnoreCase("south") ||
        direction.equalsIgnoreCase("east") || direction.equalsIgnoreCase("west")){
        System.out.println("Walking " + direction);
        isWalking = true;
    } else {
        System.out.println("Invalid direction");
    }
    return isWalking;
}