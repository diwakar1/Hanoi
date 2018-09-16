package com.company;

public class Hanoi {

    // write your code here
        private int numDiscs;// number of discs

    // constructor : the argument is the number of disks to use
    public Hanoi(int numDiscs) {
        this.numDiscs = numDiscs;
        moveDiscs(numDiscs,1,3,2);
    }

    // it uses recursion method to move discs from one peg to another peg
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg){

        if(num>0){

            moveDiscs(num-1,fromPeg,tempPeg,toPeg);
            System.out.println("Move a disc from Peg " + fromPeg+" to peg"+ toPeg);
            moveDiscs(num-1,tempPeg,toPeg,fromPeg);
        }
    }
}

