package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractionList = new ArrayList<>();
        Fraction fraction1 = new Fraction(1,1);
        Fraction fraction2 = new Fraction(2,2);
        Fraction fraction3 = new Fraction(3,3);
        fractionList.add(fraction1);
        fractionList.add(fraction2);
        fractionList.add(fraction3);
        this.user = new User("1","David","Wu",fractionList);
    }

    @Test
    void testUserNoList(){
        User user2 = new User();
        assertNotNull(user2.getFractions());
    }

    @Test
    void testUserWithInf(){
        List<Fraction> fractionList = new ArrayList<>();
        User user3 = new User("1","David","Wu",fractionList);
        assertEquals("1",user3.getId());
        assertEquals("David",user3.getName());
        assertEquals("Wu",user3.getFamilyName());
        assertNotNull(user3.getFractions());
    }

    @Test
    void testGetId(){
        assertEquals("1",user.getId());
    }

    @Test
    void testGetName(){
        assertEquals("David",user.getName());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("Wu",user.getFamilyName());
    }

    @Test
    void testGetFractions(){
        assertEquals(3,user.getFractions().size());
    }

    @Test
    void testSetName(){
        user.setName("Hongxiang");
        assertEquals("Hongxiang",user.getName());
    }

    @Test
    void testFullName(){ assertEquals("David Wu", user.fullName());
    }

    @Test
    void testSetFamilyName(){
        user.setFamilyName("Li");
        assertEquals("Li",user.getFamilyName());
    }

    @Test
    void testSetFraction(){
        List<Fraction> fractionListNew = new ArrayList<>();
        Fraction fraction4 = new Fraction(2,2);
        Fraction fraction5 = new Fraction(1,1);
        fractionListNew.add(fraction4);
        fractionListNew.add(fraction5);
        user.setFractions(fractionListNew);
        assertEquals(2,user.getFractions().size());
    }

    @Test
    void testAddFraction(){
        Fraction fraction6 = new Fraction(4,4);
        user.addFraction(fraction6);
        assertEquals(4,user.getFractions().size());
    }

}
