package homework_nr_12;

    public enum FuelTypes {
        GASOLINE,
        LPG,
        DIESEL,
        CNG,
        ELECTRICITY;


        public boolean isLiquid(){
            return switch (this) {
                case GASOLINE, DIESEL -> true;
                default -> false;
            };
        }
    }

