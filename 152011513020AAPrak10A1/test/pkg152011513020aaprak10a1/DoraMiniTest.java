/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020aaprak10a1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Agiftsany Azhar
 */
public class DoraMiniTest {
    
    public DoraMiniTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setPemilik method, of class DoraMini.
     */
    @Test
    public void testSetPemilik() {
        System.out.println("setPemilik");
        String pemilik = "Agiftsany";
        DoraMini instance = new DoraMini();
        instance.setPemilik(pemilik);
    }

    /**
     * Test of getPemilik method, of class DoraMini.
     */
    @Test
    public void testGetPemilik() {
        System.out.println("getPemilik");
        DoraMini instance = new DoraMini();
        String expResult = "Agiftsany";
        String result = instance.getPemilik();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class DoraMini.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "Dora";
        DoraMini instance = new DoraMini();
        instance.setNama(nama);
    }

    /**
     * Test of setTahunPembuatan method, of class DoraMini.
     */
    @Test
    public void testSetTahunPembuatan() {
        System.out.println("setTahunPembuatan");
        int tahun = 2022;
        DoraMini instance = new DoraMini();
        instance.setTahunPembuatan(tahun);
    }

    /**
     * Test of displayData method, of class DoraMini.
     */
    @Test
    public void testDisplayData() {
        System.out.println("displayData");
        DoraMini instance = new DoraMini();
        instance.displayData();
    }

    /**
     * Test of sayDora method, of class DoraMini.
     */
    @Test
    public void testSayDora() {
        System.out.println("sayDora");
        DoraMini instance = new DoraMini();
        instance.sayDora();
    }

    /**
     * Test of displayKantongAjaib method, of class DoraMini.
     */
    @Test
    public void testDisplayKantongAjaib() {
        System.out.println("displayKantongAjaib");
        DoraMini instance = new DoraMini();
        instance.displayKantongAjaib();
    }
    
}
