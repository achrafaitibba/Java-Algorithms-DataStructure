package z_other.new_switch;

class Main {
    public static void main(String[] args) {
        int day = 7;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6 -> "Weekend";
            case 7 -> {
                String name = "Weekend";
                yield  name.concat("_hh");
            }
            default -> throw new IllegalArgumentException("Invalid day");
        };

        System.out.println(dayType);
    }
}
