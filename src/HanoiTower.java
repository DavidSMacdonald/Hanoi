public class HanoiTower {
    private Peg peg1;
    private Peg peg2;
    private Peg peg3;
    private int numDiscs;

    public String toString() {
        return "";
    }

    public HanoiTower(int num)
    {
        numDiscs=num;
        // TODO implement constructor
        peg1 = new Peg(1, num);
        for (int i = num; i > 0; i--) {
            peg1.addDisc(i);
        }
        peg2 = new Peg(2, num);
        peg3 = new Peg(3, num);

    }
    public void solveTower()
    {
        moveTower(peg1, peg3, peg2, numDiscs);
    }

    private void moveTower(Peg startPeg, Peg endPeg, Peg extraPeg, int numtoMove)
    {
        // TODO move discs(number input) from the start peg to the end peg
        if (numtoMove < 0) return;
        if (numtoMove == 0) {
            startPeg.moveTopDisc(extraPeg);
            return;
        }
        if (numtoMove == 1) {
            startPeg.moveTopDisc(endPeg);
            return;
        }
        moveTower(startPeg,extraPeg,endPeg,numtoMove-1);
        startPeg.moveTopDisc(endPeg);
        moveTower(extraPeg,endPeg,startPeg,numtoMove-1);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HanoiTower ht = new HanoiTower(5);
        ht.solveTower();

    }

}

/* OUTPUT
Moving disc 1 from peg 1 to peg 3
Moving disc 2 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 3 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 1
Moving disc 2 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
Moving disc 4 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 2 from peg 3 to peg 1
Moving disc 1 from peg 2 to peg 1
Moving disc 3 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 3
Moving disc 2 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 5 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 1
Moving disc 2 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
Moving disc 3 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 2
Moving disc 2 from peg 3 to peg 1
Moving disc 1 from peg 2 to peg 1
Moving disc 4 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
Moving disc 2 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 3 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 1
Moving disc 2 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
 */