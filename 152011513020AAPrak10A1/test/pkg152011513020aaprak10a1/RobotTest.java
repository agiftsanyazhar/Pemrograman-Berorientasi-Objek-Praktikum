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
public class RobotTest {
    
    public RobotTest() {
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
     * Test of setNama method, of class Robot.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "";
        Robot instance = new RobotImpl();
        instance.setNama(nama);
    }

    /**
     * Test of setTahunPembuatan method, of class Robot.
     */
    @Test
    public void testSetTahunPembuatan() {
        System.out.println("setTahunPembuatan");
        int tahun = 0;
        Robot instance = new RobotImpl();
        instance.setTahunPembuatan(tahun);
    }

    /**
     * Test of displayData method, of class Robot.
     */
    @Test
    public void testDisplayData() {
        System.out.println("displayData");
        Robot instance = new RobotImpl();
        instance.displayData();
    }

    public class RobotImpl implements Robot {

        public void setNama(String nama) {
        }

        public void setTahunPembuatan(int tahun) {
        }

        public void displayData() {
        }
    }
    
}
