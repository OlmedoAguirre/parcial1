import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short zapatillas_nike = 30, zapatillas_adidas = 12, tacones_chanel = 5, dr_martens = 15, crocs = 50;
        boolean R = true;

        System.out.println("Bienvenido a la aplicacion de gestion de inventario de 'Zapateria carmelo'");

        while (R) {
            System.out.println("Escriba '1' para ingresar informacion sobre algun producto");
            System.out.println("Escriba '2' para calcular la cantidad de inventario de un producto disponible");
            System.out.println("Escriba '3' para determinar si hay suficiente stock para una venta");
            System.out.println("Escriba '4' duplicar el inventario inicial de un producto agotado");
            System.out.println("Escriba '5' mostrar la informacion actualizada del inventario");
            short i = sc.nextShort();

            switch (i) {
                case 1:
                    System.out.println("seleccione '1' para ingresar informacion sobre Zapatillas Nike");
                    System.out.println("seleccione '2' para ingresar informacion sobre Zapatillas Adidas");
                    System.out.println("seleccione '3' para ingresar informacion sobre Tacones Chanel");
                    System.out.println("seleccione '4' para ingresar informacion sobre Dr. Martens");
                    System.out.println("seleccione '5' para ingresar informacion sobre Crocs");
                    short l = sc.nextShort();
                    sc.nextLine();
                    switch (l) {
                        case 1:
                            System.out.println("Ingrese la informacion sobre el producto");
                            String info = sc.nextLine();
                            break;
                        case 2:
                            System.out.println("Ingrese la informacion sobre el producto");
                            info = sc.nextLine();
                            break;
                        case 3:
                            System.out.println("Ingrese la informacion sobre el producto");
                            info = sc.nextLine();
                            break;
                        case 4:
                            System.out.println("Ingrese la informacion sobre el producto");
                            info = sc.nextLine();
                            break;
                        case 5:
                            System.out.println("Ingrese la informacion sobre el producto");
                            info = sc.nextLine();
                            break;
                        default:
                            System.out.println("Por favor, ingrese una opcion valida");
                    }
                    break;
                case 2:
                    System.out.println("Escriba '1' para actualizar el inventario del producto Zapatillas Nike");
                    System.out.println("Escriba '2' para actualizar el inventario del producto Zapatillas Adidas");
                    System.out.println("Escriba '3' para actualizar el inventario del producto Tacones Chanel");
                    System.out.println("Escriba '4' para actualizar el inventario del producto Dr. Martens");
                    System.out.println("Escriba '5' para actualizar el inventario del producto Crocs");
                    short e = sc.nextShort();
                    switch (e) {
                        case 1:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            short var = sc.nextShort();
                            zapatillas_nike -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam "+ zapatillas_nike + " pares disponibles");
                            break;
                        case 2:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            zapatillas_adidas -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedan " + zapatillas_adidas + " pares disponibles");
                            break;
                        case 3:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            tacones_chanel -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam " + tacones_chanel + " pares disponibles");
                            break;
                        case 4:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            dr_martens -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam " + dr_martens + " pares disponibles");
                            break;
                        case 5:
                            System.out.println("Introduzca la cantidad de pares que se vendieron");
                            var = sc.nextShort();
                            crocs -= var;
                            System.out.println("Inventario actualizado");
                            System.out.println("Quedam " +crocs + " pares disponibles");
                            break;
                        default:
                            System.out.println("Por favor,escriba una opcion valida");

                    }
                    break;
                case 3:
                    System.out.println("Escriba '1' para revisar el inventario del producto Zapatillas Nike");
                    System.out.println("Escriba '2' para revisar el inventario del producto Zapatillas Adidas");
                    System.out.println("Escriba '3' para revisar el inventario del producto Tacones Chanel");
                    System.out.println("Escriba '4' para revisar el inventario del producto Dr. Martens");
                    System.out.println("Escriba '5' para revisar el inventario del producto Crocs");
                    short o = sc.nextShort();
                    switch (o) {
                        case 1:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            short var2 = sc.nextShort();
                            if (var2 > zapatillas_nike) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > zapatillas_adidas) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > tacones_chanel) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > dr_martens) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad de pares que desea vender");
                            var2 = sc.nextShort();
                            if (var2 > crocs) {System.out.println("No hay stock suficiente");}
                            else {System.out.println("Hay stock disponible");}
                            break;
                        default:
                            System.out.println("Por favor, ingrese una opcion valida");
                    }
                    break;
                case 4:
                    System.out.println("Escriba '1' para revisar el inventario del producto Zapatillas Nike");
                    System.out.println("Escriba '2' para revisar el inventario del producto Zapatillas Adidas");
                    System.out.println("Escriba '3' para revisar el inventario del producto Tacones Chanel");
                    System.out.println("Escriba '4' para revisar el inventario del producto Dr. Martens");
                    System.out.println("Escriba '5' para revisar el inventario del producto Crocs");
                    short u = sc.nextShort();
                    switch (u) {
                        case 1:
                            if (zapatillas_nike == 0) {
                                zapatillas_nike = 60;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 2:
                            if (zapatillas_adidas == 0) {
                                zapatillas_adidas = 24;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 3:
                            if (tacones_chanel == 0) {
                                tacones_chanel = 10;System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 4:
                            if (dr_martens == 0) {
                                dr_martens = 30;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        case 5:
                            if (crocs == 0) {
                                crocs = 100;
                                System.out.println("Stock duplicado");
                            }
                            else {System.out.println("Todavia hay stock disponible");}
                            break;
                        default:
                            System.out.println("Por favor, ingrese una opcion valida");
                    }
                    break;
                case 5:
                    System.out.println("Cantidad de pares de 'Zapatillas Nike' disponible: "+zapatillas_nike);
                    System.out.println("Cantidad de pares de 'Zapatillas Adidas' disponible: "+zapatillas_adidas);
                    System.out.println("Cantidad de pares de 'Tacones Chanel' disponible: "+tacones_chanel);
                    System.out.println("Cantidad de pares de 'Dr. Martens' disponible: "+dr_martens);
                    System.out.println("Cantidad de pares de 'Crocs' disponible: "+crocs);
                    break;
                default:
                    System.out.println("Por favor, ingrese un numero valido");
            }

            System.out.println("Desea realizar otra accion? (y/n): ");
            char a = sc.next().charAt(0);
            if (a == 'n') {R = false;}
        }
    }
}