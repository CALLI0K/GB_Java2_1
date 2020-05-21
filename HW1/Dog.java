package geekbrains.HW1;


public class Dog implements Competitor {
    public int runtime;
    public int jump;

    public Dog(int runtime, int jump) {
        this.runtime = runtime;
        this.jump = jump;
    }
    public void run() {
        System.out.println("Dog пробежал " + jump + " метров");
    }


    public void jump() {
        System.out.println("Dog подпрыгнул на " + jump + " метров");
    }

    @Override
    public boolean canPass() {
        boolean canRun = (runtime >= track.getLength());
        if (canRun) {
            System.out.println("Dog пробежал дистанцию");
        } else {
            System.out.println("Dog не пробежал дистанцию");
            return false;
        }
        boolean canJump = (jump >= Wall.getHeight());
        if (canJump) {
            System.out.println("Dog забрался на препятвие!");
        } else {
            System.out.println("Dog не забрался на препятвие...");
        }
        return canRun && canJump;
    }


}