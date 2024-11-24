abstract class Vehiculo {
    public abstract void arrancar();
    public abstract void detener();
    public abstract int obtenerCapacidad();
}

class Autobus extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Autobus arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Autobus detenido");
    }

    @Override
    public int obtenerCapacidad() {
        return 50;
    }
}

class Taxi extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Taxi arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Taxi detenido");
    }

    @Override
    public int obtenerCapacidad() {
        return 4;
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Bicicleta lista");
    }

    @Override
    public void detener() {
        System.out.println("Bicicleta detenida");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }
}
//
public class SistemaTransporte {
    static void gestionarVehiculo(Vehiculo vehiculo) {
        vehiculo.arrancar();
        System.out.println("Capacidad del vehiculo: " + vehiculo.obtenerCapacidad());
        vehiculo.detener();
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Vehiculo autobus = new Autobus();
        Vehiculo taxi = new Taxi();
        Vehiculo bicicleta = new Bicicleta();

        gestionarVehiculo(autobus);
        gestionarVehiculo(taxi);
        gestionarVehiculo(bicicleta);
    }
}
