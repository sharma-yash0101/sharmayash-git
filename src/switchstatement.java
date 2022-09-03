import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit: ");
        String fruit= in.next();

        switch (fruit) {
            case "apple" -> System.out.println("Apple  (Malus sp., Rosaceae) is cultivated worldwide as a \n" +
                    "fruit tree, and is the most widely grown species in the genus Malus. The apple tree \n" +
                    "originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today.\n" +
                    "Apples have been grown for thousands of years in Asia and Europe, and were brought to\na" +
                    "North America by European colonists.\n" +
                    "Apples are popular because of the many ways that they can be consumed \n" +
                    "and because of their convenience and durability.\n" +
                    "Apples can be processed into sauce, slices, or juice and are favored for pastries, cakes, tarts, and pies.\n");
            case "mango" -> System.out.println("A mango is an edible stone fruit produced by the tropical tree \n" +
                    "Mangifera indica which is believed to have originated in the region between northwestern Myanmar,\n" +
                    " Bangladesh, and northeastern India. M. indica has been cultivated in South and Southeast Asia\n " +
                    "since ancient times resulting in two types of modern mango cultivars: the \"Indian type\" and \n" +
                    "the \"Southeast Asian type\". Other species in the genus Mangifera also produce\n" +
                    " edible fruits that are also called \"mangoes\", the majority of which are\n " +
                    "found in the Malesian ecoregion.\n" +
                    "\n" +
                    "Worldwide, there are several hundred cultivars of mango. Depending on the cultivar,\n" +
                    " mango fruit varies in size, shape, sweetness, skin color,\n" +
                    " and flesh color which may be pale yellow, gold, green, or orange.\n" +
                    " Mango is the national fruit of India, Pakistan and the Philippines,\n" +
                    " while the mango tree is the national tree of Bangladesh.\n");
            case "orange" -> System.out.println("An orange is a fruit of various citrus species in the\n" +
                    " family Rutaceae (see list of plants known as orange); it primarily refers to Citrus × sinensis\n" +
                    " which is also called sweet orange, to distinguish it from the related Citrus × aurantium,\n" +
                    " referred to as bitter orange. The sweet orange reproduces asexually \n" +
                    "(apomixis through nucellar embryony); varieties of sweet orange arise through mutations.\n" +
                    "The orange is a hybrid between pomelo (Citrus maxima) and mandarin (Citrus reticulata)\n" +
                    "The chloroplast genome, and therefore the maternal line, is that of pomelo.\n" +
                    "The sweet orange has had its full genome sequenced.\n");
            case "grape" -> System.out.println("A grape is a fruit, botanically a berry, of the deciduous woody vines\n" +
                    " of the flowering plant genus Vitis. Grapes can be eaten fresh as table grapes, used for\n" +
                    " making wine, jam, grape juice, jelly, grape seed extract, vinegar, and grape seed oil, or\n" +
                    " dried as raisins, currants and sultanas. Grapes are a non-climacteric type of fruit,\n " +
                    "generally occurring in clusters.\n");
            default -> System.out.println("Enter a valid fruit name from the given list: \n (1)apple\n (2)mango \n (3)orange \n (4)grape\n ");
        }
    }
}
