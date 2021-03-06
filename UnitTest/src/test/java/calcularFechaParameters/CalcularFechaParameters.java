package calcularFechaParameters;

import ejercicio1.CalcularNota;
import ejercicio2.CalcularFecha;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalcularFechaParameters {
    private int day;
    private String month;
    private int year;
    private int hour;
    private int minute;
    private int second;
    private String expectedResult;

    public CalcularFechaParameters(int day, String month, int year, int hour, int minute, int second, String expectedResult) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();

        objects.add(new Object[]{32, "Enero", 2000, 0, 0, 0, "Invalid day: 32"});
        objects.add(new Object[]{-1, "Enero", 2000, 0, 0, 0, "Invalid day: -1"});
        objects.add(new Object[]{1, "Hola", 2000, 0, 0, 0, "Invalid month: Hola"});
        objects.add(new Object[]{1, "Enero", -1, 0, 0, 0, "Invalid year: -1"});
        objects.add(new Object[]{1, "Enero", 2000, -1, 0, 0, "Invalid hour: -1"});
        objects.add(new Object[]{1, "Enero", 2000, 25, 0, 0, "Invalid hour: 25"});
        objects.add(new Object[]{1, "Enero", 2000, 0, -1, 0, "Invalid minute: -1"});
        objects.add(new Object[]{1, "Enero", 2000, 0, 61, 0, "Invalid minute: 61"});
        objects.add(new Object[]{1, "Enero", 2000, 0, 0, -1, "Invalid second: -1"});
        objects.add(new Object[]{1, "Enero", 2000, 0, 0, 61, "Invalid second: 61"});
        objects.add(new Object[]{29, "Febrero", 2019, 0, 0, 0, "Invalid day: 29"});

        objects.add(new Object[]{1, "Enero", 2000, 0, 0, 0, "1 Enero 2000 0:0:1"});
        objects.add(new Object[]{1, "Marzo", 2000, 0, 0, 59, "1 Marzo 2000 0:1:0"});
        objects.add(new Object[]{1, "Abril", 2000, 0, 59, 59, "1 Abril 2000 1:0:0"});
        objects.add(new Object[]{1, "Mayo", 2000, 23, 59, 59, "2 Mayo 2000 0:0:0"});
        objects.add(new Object[]{31, "Enero", 2000, 23, 59, 59, "1 Febrero 2000 0:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2000, 23, 59, 59, "1 Enero 2001 0:0:0"});
        objects.add(new Object[]{28, "Febrero", 2020, 23, 59, 59, "29 Febrero 2020 0:0:0"});
        objects.add(new Object[]{28, "Febrero", 2019, 23, 59, 59, "1 Marzo 2019 0:0:0"});
        objects.add(new Object[]{29, "Febrero", 2020, 23, 59, 59, "1 Marzo 2020 0:0:0"});
        objects.add(new Object[]{28, "Marzo", 2019, 23, 59, 59, "29 Marzo 2019 0:0:0"});

        objects.add(new Object[]{15, "Junio", 2000, 0, 0, 0, "15 Junio 2000 0:0:1"});
        objects.add(new Object[]{1, "Julio", 1950, 0, 0, 0, "1 Julio 1950 0:0:1"});
        objects.add(new Object[]{1, "Agosto", 2000, 12, 0, 0, "1 Agosto 2000 12:0:1"});
        objects.add(new Object[]{1, "Septiembre", 2000, 0, 30, 0, "1 Septiembre 2000 0:30:1"});
        objects.add(new Object[]{1, "Octubre", 2000, 0, 0, 30, "1 Octubre 2000 0:0:31"});
        objects.add(new Object[]{1, "Noviembre", 2020, 13, 27, 48, "1 Noviembre 2020 13:27:49"});
        objects.add(new Object[]{30, "Noviembre", 2020, 23, 59, 59, "1 Diciembre 2020 0:0:0"});
        objects.add(new Object[]{30, "Diciembre", 2020, 23, 59, 59, "31 Diciembre 2020 0:0:0"});

        objects.add(new Object[]{1, "Enero", 2020, 23, 59, 59, "2 Enero 2020 0:0:0"});
        objects.add(new Object[]{1, "Febrero", 2020, 23, 59, 59, "2 Febrero 2020 0:0:0"});
        objects.add(new Object[]{1, "Marzo", 2020, 23, 59, 59, "2 Marzo 2020 0:0:0"});
        objects.add(new Object[]{1, "Abril", 2020, 23, 59, 59, "2 Abril 2020 0:0:0"});
        objects.add(new Object[]{1, "Mayo", 2020, 23, 59, 59, "2 Mayo 2020 0:0:0"});
        objects.add(new Object[]{1, "Junio", 2020, 23, 59, 59, "2 Junio 2020 0:0:0"});
        objects.add(new Object[]{1, "Julio", 2020, 23, 59, 59, "2 Julio 2020 0:0:0"});
        objects.add(new Object[]{1, "Agosto", 2020, 23, 59, 59, "2 Agosto 2020 0:0:0"});
        objects.add(new Object[]{1, "Septiembre", 2020, 23, 59, 59, "2 Septiembre 2020 0:0:0"});
        objects.add(new Object[]{1, "Octubre", 2020, 23, 59, 59, "2 Octubre 2020 0:0:0"});
        objects.add(new Object[]{1, "Noviembre", 2020, 23, 59, 59, "2 Noviembre 2020 0:0:0"});
        objects.add(new Object[]{1, "Diciembre", 2020, 23, 59, 59, "2 Diciembre 2020 0:0:0"});

        objects.add(new Object[]{31, "Enero", 2020, 23, 59, 59, "1 Febrero 2020 0:0:0"});
        objects.add(new Object[]{28, "Febrero", 2021, 23, 59, 59, "1 Marzo 2021 0:0:0"});
        objects.add(new Object[]{29, "Febrero", 2020, 23, 59, 59, "1 Marzo 2020 0:0:0"});
        objects.add(new Object[]{31, "Marzo", 2020, 23, 59, 59, "1 Abril 2020 0:0:0"});
        objects.add(new Object[]{30, "Abril", 2020, 23, 59, 59, "1 Mayo 2020 0:0:0"});
        objects.add(new Object[]{31, "Mayo", 2020, 23, 59, 59, "1 Junio 2020 0:0:0"});
        objects.add(new Object[]{30, "Junio", 2020, 23, 59, 59, "1 Julio 2020 0:0:0"});
        objects.add(new Object[]{31, "Julio", 2020, 23, 59, 59, "1 Agosto 2020 0:0:0"});
        objects.add(new Object[]{31, "Agosto", 2020, 23, 59, 59, "1 Septiembre 2020 0:0:0"});
        objects.add(new Object[]{30, "Septiembre", 2020, 23, 59, 59, "1 Octubre 2020 0:0:0"});
        objects.add(new Object[]{31, "Octubre", 2020, 23, 59, 59, "1 Noviembre 2020 0:0:0"});
        objects.add(new Object[]{30, "Noviembre", 2020, 23, 59, 59, "1 Diciembre 2020 0:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 23, 59, 59, "1 Enero 2021 0:0:0"});

        objects.add(new Object[]{20, "Febrero", -1, 23, 59, 59, "Invalid year: -1"});
        objects.add(new Object[]{31, "Febrero", 2020, 23, 59, 59, "Invalid day: 31"});
        objects.add(new Object[]{31, "Diciembres", 2020, 23, 59, 59, "Invalid month: Diciembres"});

        objects.add(new Object[]{31, "Diciembre", 2020, -1, 59, 59, "Invalid hour: -1"});
        objects.add(new Object[]{31, "Diciembre", 2020, 00, 59, 59, "31 Diciembre 2020 1:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 59, 59, "31 Diciembre 2020 2:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 11, 59, 59, "31 Diciembre 2020 12:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 12, 59, 59, "31 Diciembre 2020 13:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 13, 59, 59, "31 Diciembre 2020 14:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 22, 59, 59, "31 Diciembre 2020 23:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 23, 59, 59, "1 Enero 2021 0:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 24, 59, 59, "Invalid hour: 24"});

        objects.add(new Object[]{31, "Diciembre", 2020, 01, -1, 59, "Invalid minute: -1"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 00, 59, "31 Diciembre 2020 1:1:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 59, "31 Diciembre 2020 1:2:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 29, 59, "31 Diciembre 2020 1:30:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 30, 59, "31 Diciembre 2020 1:31:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 31, 59, "31 Diciembre 2020 1:32:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 58, 59, "31 Diciembre 2020 1:59:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 59, 59, "31 Diciembre 2020 2:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 60, 59, "Invalid minute: 60"});

        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, -1, "Invalid second: -1"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 00, "31 Diciembre 2020 1:1:1"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 01, "31 Diciembre 2020 1:1:2"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 29, "31 Diciembre 2020 1:1:30"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 30, "31 Diciembre 2020 1:1:31"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 31, "31 Diciembre 2020 1:1:32"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 58, "31 Diciembre 2020 1:1:59"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 59, "31 Diciembre 2020 1:2:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 01, 01, 60, "Invalid second: 60"});

        objects.add(new Object[]{39, "Dragon", -1000, 25, 69, 80, "Invalid day: 39"});

        return objects;
    }

    @Test
    public void verify_fecha_all_values() {
        CalcularFecha calcularFecha = new CalcularFecha();
        String actualResult = calcularFecha.calcularSiguiente(this.day, this.month, this.year, this.hour, this.minute, this.second);
        Assert.assertEquals("Mal", this.expectedResult, actualResult);
    }
}
