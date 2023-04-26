public class enumSolar {


    public enum Solar {
        Mercury(1, 0, null),
        Venus(2, 1, Mercury),
        Earth(3, 2, Venus),
        Mars(4, 3, Earth);

        public final double distanceFromSun;

        private Solar(int orderFromSun, int distanceFromPrevious, Solar previousPlanet) {
            this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPrevious : distanceFromPrevious;
        }
    }


}
