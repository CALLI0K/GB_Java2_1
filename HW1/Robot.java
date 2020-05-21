package geekbrains.HW1;


public class Robot implements Competitor {
    public int runtime;
    public int jump;

    public Robot(int runtime, int jump) {
        this.runtime = runtime;
        this.jump = jump;
    }
    public void run() {
        System.out.println("Робот пробежал " + jump + " метров");
    }


    public void jump() {
        System.out.println("Робот подпрыгнул на " + jump + " метров");
    }

    @Override
    public boolean canPass() {
        boolean canRun = (runtime >= track.getLength());
        if (canRun) {
            System.out.println("Робот пробежал дистанцию");
        } else {
            System.out.println("Робот не пробежал дистанцию");
            return false;
        }
        boolean canJump = (jump >= Wall.getHeight());
        if (canJump) {
            System.out.println("Робот забрался на препятвие!");
        } else {
            System.out.println("Робот не забрался на препятвие...");
        }
        return canRun && canJump;
    }


}