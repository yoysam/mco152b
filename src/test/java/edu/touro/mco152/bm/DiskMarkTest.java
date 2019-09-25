package edu.touro.mco152.bm;

import edu.touro.mco152.bm.DiskMark;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import edu.touro.mco152.bm.DiskMark;
import static org.junit.jupiter.api.Assertions.*;

class DiskMarkTest {
    DiskMark test= new DiskMark(DiskMark.MarkType.WRITE);
    @BeforeAll
    public  void init(){
        DiskMark test= new DiskMark(DiskMark.MarkType.WRITE);
    }
    @Test
    public void Crosstest(){
                test.setBwMbSec(123.33);
                assertEquals(122.33,test.getBwMbSec());
    }
}