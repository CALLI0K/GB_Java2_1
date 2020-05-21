package geekbrains.HW1;


public class Man implements Competitor {
    public int runtime;
    public int jump;

    public Man(int runtime, int jump) {
        this.runtime = runtime;
        this.jump = jump;
    }
    public void run() {
        System.out.println("человек пробежал " + jump + " метров");
    }


    public void jump() {
        System.out.println("человек подпрыгнул на " + jump + " метров");
    }

    @Override
    public boolean canPass() {
        boolean canRun = (runtime >= track.getLength());
        if (canRun) {
            System.out.println("человек пробежал дистанцию");
        } else {
            System.out.println("человек не пробежал дистанцию");
            return false;
        }
        boolean canJump = (jump >= Wall.getHeight());
        if (canJump) {
            System.out.println("человек забрался на препятвие!");
        } else {
            System.out.println("человек не забрался на препятвие...");
        }
        return canRun && canJump;
    }


}