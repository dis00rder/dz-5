public class enumM {


    public enum CardRank {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4);

        public final int label;

        private CardRank(int label) {
            this.label = label;
        }
    }
}
