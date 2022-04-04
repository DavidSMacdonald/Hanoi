public class HanoiTower {
    private Peg peg1;
    private Peg peg2;
    private Peg peg3;
    private int numDiscs;

    public HanoiTower(int num)
    {
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
        startPeg.moveTopDisc(endPeg);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HanoiTower ht = new HanoiTower(2);
        ht.solveTower();
    }

}