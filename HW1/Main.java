package geekbrains.HW1;

class Competition {
        static Competitor[] competitors = {new Dog(120, 1),
                new Man(200, 3),
                new Robot(30, 0)};

        public static void main(String[] args) {
        for (Competitor competitor:competitors) {
               competitor.canPass();
        }
        }
}
