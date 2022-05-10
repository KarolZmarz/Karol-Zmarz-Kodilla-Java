package kodilla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        //Europe
        Country USA  = new Country(new BigDecimal("2000000"));
        Country Poland = new Country(new BigDecimal("3000000"));
        Country Ukraine = new Country(new BigDecimal("4000000"));
        Country Germany = new Country(new BigDecimal("5000000"));
        Country France = new Country(new BigDecimal("6000000"));

        //Africa
        Country Sudan = new Country(new BigDecimal("7000000"));
        Country Egypt = new Country(new BigDecimal("8000000"));
        Country Algeria = new Country(new BigDecimal("9000000"));
        Country RPA = new Country(new BigDecimal("10000000"));
        Country Botswana = new Country(new BigDecimal("11000000"));

        //Asia
        Country China = new Country(new BigDecimal("12000000"));
        Country Japan = new Country(new BigDecimal("13000000"));
        Country India = new Country(new BigDecimal("14000000"));
        Country Russia = new Country(new BigDecimal("15000000"));
        Country Singapore = new Country(new BigDecimal("16000000"));

        Continent europe    = new Continent(List.of(USA, Poland, Ukraine, Germany, France));
        Continent africa    = new Continent(List.of(Sudan, Egypt, Algeria, RPA, Botswana));
        Continent asia      = new Continent(List.of(China, Japan, India, Russia, Singapore));


        World world = new World(List.of(europe, africa, asia));

        //when
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("135000000");

        //Then
        assertEquals(expectedResult,result);

    }
}
