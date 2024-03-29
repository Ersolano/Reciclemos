package itcr.reciclemos;

import android.content.Context;
import android.graphics.Point;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

import itcr.reciclemos.gameengine.ThrashType;

/**
 * Created by gesab on 4/11/2016.
 */
public class Utilities {

    private static Utilities singleton;
    private Point screenSize;

    private Utilities() { }

    public static Utilities getSingleton() {
        if (singleton == null) {
            singleton = new Utilities();
        }
        return singleton;
    }

    public void init(Point screenSize) {
        this.screenSize = screenSize;
    }

    public final int INT_DELAY_FOREST_ANIMATION = 4000;
    public final int INT_MILLISECONDS_HOUSE_TIMER = 40000;
    public final int INT_MILLISECONDS_LAKE_TIMER = 45000;
    public final int INT_MILLISECONDS_FOREST_TIMER = 50000;

    public final Point POINT_BACKGROUND = new Point(1067, 711);
    public final int POINT_C_ALL_PLAYABLE_TOP = 150;
    public final int POINT_C_ALL_PLAYABLE_BOTTOM = 166;
    public final Point POINT_D_MAIN_RECYCLE = new Point(123, 81);
    public final Point POINT_C_MAIN_RECYCLE = new Point(50, 20);    //Left-Bottom
    public final Point POINT_D_MAIN_HOUSE = new Point(294, 214);
    public final Point POINT_C_MAIN_HOUSE = new Point(199, 80);
    public final Point POINT_D_MAIN_LAKE = new Point(276, 82);
    public final Point POINT_C_MAIN_LAKE = new Point(501, 60);
    public final Point POINT_D_MAIN_FOREST = new Point(232, 214);
    public final Point POINT_C_MAIN_FOREST = new Point(785, 72);
    public final Point POINT_D_MAIN_ABOUT = new Point(152, 187);
    public final Point POINT_C_MAIN_ABOUT = new Point(660, 440);
    public final Point POINT_D_ALL_TRASHCAN = new Point(149,96);
    public final Point POINT_C_HOUSE_GREEN_TRASHCAN = new Point(55,0);
    public final Point POINT_C_HOUSE_BLUE_TRASHCAN = new Point(257,0);
    public final Point POINT_C_HOUSE_YELLOW_TRASHCAN = new Point(459,0);
    public final Point POINT_C_HOUSE_GRAY_TRASHCAN = new Point(661,0);
    public final Point POINT_C_HOUSE_BLACK_TRASHCAN = new Point(863,0);
    public final Point POINT_C_LAKE_GREEN_TRASHCAN = new Point(24,0);
    public final Point POINT_C_LAKE_BLUE_TRASHCAN = new Point(198,0);
    public final Point POINT_C_LAKE_YELLOW_TRASHCAN = new Point(372,0);
    public final Point POINT_C_LAKE_GRAY_TRASHCAN = new Point(546,0);
    public final Point POINT_C_LAKE_BLACK_TRASHCAN = new Point(720,0);
    public final Point POINT_C_LAKE_RED_TRASHCAN = new Point(894,0);

    public final Point POINT_C_FOREST_GREEN_TRASHCAN = new Point(0,0);
    public final Point POINT_C_FOREST_BLUE_TRASHCAN = new Point(130,0);
    public final Point POINT_C_FOREST_YELLOW_TRASHCAN = new Point(260,0);
    public final Point POINT_C_FOREST_GRAY_TRASHCAN = new Point(390,0);
    public final Point POINT_C_FOREST_BLACK_TRASHCAN = new Point(520,0);
    public final Point POINT_C_FOREST_RED_TRASHCAN = new Point(650,0);
    public final Point POINT_C_FOREST_ORANGE_TRASHCAN = new Point(780,0);
    public final Point POINT_C_FOREST_PURPLE_TRASHCAN = new Point(910,0);


    public final Point POINT_D_ALL_THRASH = new Point(80,80);

    public final int INT_D_ALL_TAB = 200;

    public final String STRING_MSG_DIALOG_MISSES = "Se ha clasificado toda la basura, pero no correctamente. Debe obtener un puntaje mínimo de 80";
    public final String STRING_MSG_DIALOG_FLAWLESS = "¡Felicidades! Se ha clasificado toda la basura.\nPuntaje Obtenido: ";
    public final String STRING_MSG_DIALOG_NOTIME = "El tiempo se agotó y no se clasificó toda la basura.\nPuntaje Obtenido: ";
    public final String STRING_MSG_DIALOG_BACK = "Volver";
    public final String STRING_MSG_DIALOG_RESTART = "Reiniciar";
    public final String STRING_MSG_DIALOG_MAINMENU = "Menú principal";
    public final String STRING_MSG_DIALOG_OPTION = "Seleccione una opción:";

    public final String STRING_PREFIX_ACTIVITY_TITLE = "Reciclemos - ";

    public final String[] STRING_GRAY_ALL_DESC = {
            "Papel periódico",
            "Hoja de papel",
            "Revista",
            "Historieta",
            "Libro en mal estado",
            "Caja cartón",
            "Caja cartón",
            "Caja cartón",
            "Caja cartón",
            "Bolsa de papel"
    };
    public final Integer[] INTEGER_GRAY_ALL_DRAWABLE = {
            R.drawable.trash_blue_1,
            R.drawable.trash_blue_2,
            R.drawable.trash_blue_3,
            R.drawable.trash_blue_4,
            R.drawable.trash_blue_5,
            R.drawable.trash_blue_6,
            R.drawable.trash_blue_7,
            R.drawable.trash_blue_8,
            R.drawable.trash_blue_9,
            R.drawable.trash_blue_10
    };

    public final String[] STRING_BLUE_ALL_DESC = {
            "Empaque Tetra Brik",
            "Empaque Tetra Brik",
            "Empaque Tetra Brik",
            "Empaque Tetra Brik",
            "Empaque Tetra Brik",
            "Botella plástica",
            "Botella plástica",
            "Dispensador de salsa plástico",
            "Galón plástico"
    };
    public final Integer[] INTEGER_BLUE_ALL_DRAWABLE = {
            R.drawable.trash_yellow_6,
            R.drawable.trash_yellow_7,
            R.drawable.trash_yellow_8,
            R.drawable.trash_yellow_9,
            R.drawable.trash_yellow_10,
            R.drawable.trash_yellow_11,
            R.drawable.trash_yellow_12,
            R.drawable.trash_yellow_13,
            R.drawable.trash_yellow_14
    };

    public final String[] STRING_ORANGE_ALL_DESC = {
            "Botella de vidrio",
            "Botella de vidrio",
            "Botella de vidrio quebrada",
            "Botella de vidrio",
            "Botella de vidrio",
            "Botella de vidrio",
            "Botella de vidrio",
            "Vaso de vidrio",
            "Copa de vidrio",
            "Copa de cristal",
            "Pecera"
    };
    public final Integer[] INTEGER_ORANGE_ALL_DRAWABLE = {
            R.drawable.trash_green_1,
            R.drawable.trash_green_2,
            R.drawable.trash_green_3,
            R.drawable.trash_green_4,
            R.drawable.trash_green_5,
            R.drawable.trash_green_6,
            R.drawable.trash_green_7,
            R.drawable.trash_green_8,
            R.drawable.trash_green_9,
            R.drawable.trash_green_10,
            R.drawable.trash_green_11
    };

    public final String[] STRING_YELLOW_ALL_DESC = {
            "Lata de atún",
            "Lata de refresco",
            "Lata de refresco",
            "Lata de refresco",
            "Recipiente metálico"
    };
    public final Integer[] INTEGER_YELLOW_ALL_DRAWABLE = {
            R.drawable.trash_yellow_1,
            R.drawable.trash_yellow_2,
            R.drawable.trash_yellow_3,
            R.drawable.trash_yellow_4,
            R.drawable.trash_yellow_5
    };

    public final String[] STRING_GREEN_ALL_DESC = {
            "Resto de naranja",
            "Resto de pera",
            "Resto de elote",
            "Resto de tomate",
            "Resto de manzana",
            "Resto de pescado",
            "Resto de pollo",
            "Resto de pollo",
            "Resto de huevo"
    };
    public final Integer[] INTEGER_GREEN_ALL_DRAWABLE = {
            R.drawable.trash_gray_1,
            R.drawable.trash_gray_2,
            R.drawable.trash_gray_3,
            R.drawable.trash_gray_4,
            R.drawable.trash_gray_5,
            R.drawable.trash_gray_6,
            R.drawable.trash_gray_7,
            R.drawable.trash_gray_8,
            R.drawable.trash_gray_9
    };

    public final String[] STRING_RED_ALL_DESC = {
            "Desecho hospitalario",
            "Desecho químico",
            "Desecho tóxico",
            "Desecho farmacéutico",
            "Jeringa (sin aguja)",
            "Desecho farmacéutico",
            "Desecho farmacéutico",
            "Bombillo",
            "Baterías",
            "Desecho industrial"
    };
    public final Integer[] INTEGER_RED_ALL_DRAWABLE = {
            R.drawable.trash_red_1,
            R.drawable.trash_red_2,
            R.drawable.trash_red_3,
            R.drawable.trash_red_4,
            R.drawable.trash_red_5,
            R.drawable.trash_red_6,
            R.drawable.trash_red_7,
            R.drawable.trash_red_8,
            R.drawable.trash_red_9,
            R.drawable.trash_red_10
    };

    public final String[] STRING_PURPLE_ALL_DESC = {
            "Teléfono",
            "Teléfono móvil",
            "Tableta",
            "Computadora",
            "Monitor",
            "Consola de juegos",
            "Accesorio de juegos",
            "Memoria portátil",
            "Cámara fotográfica y de video",
            "Radio"
    };
    public final Integer[] INTEGER_PURPLE_ALL_DRAWABLE = {
            R.drawable.trash_purple_1,
            R.drawable.trash_purple_2,
            R.drawable.trash_purple_3,
            R.drawable.trash_purple_4,
            R.drawable.trash_purple_5,
            R.drawable.trash_purple_6,
            R.drawable.trash_purple_7,
            R.drawable.trash_purple_8,
            R.drawable.trash_purple_9,
            R.drawable.trash_purple_10
    };

    public final String[] STRING_BLACK_ALL_DESC = {
            "Bolsa con basura",
            "Pañal",
            "Pasta dental",
            "Cepillo dental",
            "Pajilla",
            "Corcho",
            "Papel fotográfico",
            "Cerámica",
            "Papel higiénico"
    };
    public final Integer[] INTEGER_BLACK_ALL_DRAWABLE = {
            R.drawable.trash_black_1,
            R.drawable.trash_black_2,
            R.drawable.trash_black_3,
            R.drawable.trash_black_4,
            R.drawable.trash_black_5,
            R.drawable.trash_black_6,
            R.drawable.trash_black_7,
            R.drawable.trash_black_8,
            R.drawable.trash_black_9
    };

    public final int SCORE_INCREASE = R.drawable.score_increase;
    public final int SCORE_DECREASE = R.drawable.score_decrease;

    public Point adjustAspect(Point originalDimension){
        double xScale = (double)screenSize.x / POINT_BACKGROUND.x;
        double yScale = (double)screenSize.y / POINT_BACKGROUND.y;
        int intNewX = (int) (xScale * originalDimension.x);
        int intNewY = (int) (yScale * originalDimension.y);
        return new Point(intNewX, intNewY);
    }

    public RelativeLayout.LayoutParams positionImage(Point coordinates, Point dimensions) {
        // -- Element Params Initialization --
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        //-- Set location and size for blueTrashCanImg
        Point adjustedSizeLB = adjustAspect(coordinates);
        Point adjustedSizeRT = new Point(POINT_BACKGROUND.x - (coordinates.x + dimensions.x), POINT_BACKGROUND.y - (coordinates.y + dimensions.y));
        Point adjustedSizeWH = adjustAspect(dimensions);
        adjustedSizeRT = adjustAspect(adjustedSizeRT);
        params.setMargins(adjustedSizeLB.x, adjustedSizeRT.y, adjustedSizeRT.x, adjustedSizeLB.y);
        params.width = adjustedSizeWH.x;
        params.height = adjustedSizeWH.y;

        return params;
    }

    public int getRandomImage(ThrashType type) {
        Random r = new Random();
        int result = 0;
        switch (type) {
            case BLACK:
                result = INTEGER_BLACK_ALL_DRAWABLE[r.nextInt(INTEGER_BLACK_ALL_DRAWABLE.length)];
                break;
            case BLUE:
                result = INTEGER_BLUE_ALL_DRAWABLE[r.nextInt(INTEGER_BLUE_ALL_DRAWABLE.length)];
                break;
            case YELLOW:
                result = INTEGER_YELLOW_ALL_DRAWABLE[r.nextInt(INTEGER_YELLOW_ALL_DRAWABLE.length)];
                break;
            case GREEN:
                result = INTEGER_GREEN_ALL_DRAWABLE[r.nextInt(INTEGER_GREEN_ALL_DRAWABLE.length)];
                break;
            case PURPLE:
                result = INTEGER_PURPLE_ALL_DRAWABLE[r.nextInt(INTEGER_PURPLE_ALL_DRAWABLE.length)];
                break;
            case RED:
                result = INTEGER_RED_ALL_DRAWABLE[r.nextInt(INTEGER_RED_ALL_DRAWABLE.length)];
                break;
            case GRAY:
                result = INTEGER_GRAY_ALL_DRAWABLE[r.nextInt(INTEGER_GRAY_ALL_DRAWABLE.length)];
                break;
            case ORANGE:
                result = INTEGER_ORANGE_ALL_DRAWABLE[r.nextInt(INTEGER_ORANGE_ALL_DRAWABLE.length)];
                break;
        }
        return result;
    }
}