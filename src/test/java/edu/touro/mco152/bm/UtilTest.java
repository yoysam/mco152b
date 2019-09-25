package edu.touro.mco152.bm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import edu.touro.mco152.bm.DiskMark;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import edu.touro.mco152.bm.DiskMark;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


class UtilTest {
	DiskMark test= new DiskMark(DiskMark.MarkType.WRITE);
	@BeforeAll
	public static   void init(){
		DiskMark test= new DiskMark(DiskMark.MarkType.WRITE);
	}
	/**
	 *  testing boundary conditions
	 *  max and min
	 */
	@ParameterizedTest
	@ValueSource(ints = {Integer.MIN_VALUE,Integer.MAX_VALUE})
	void testString(int num) {
		assertEquals(Util.displayString(num), Integer.toString(num));
	}

	/**
	 * Crosschecking using a setter and getter to see if they are the same value
	 */
		@org.junit.jupiter.api.Test
		void CrossTest(){
		test.setBwMbSec(112.3);
		assertEquals(112.3,test.getBwMbSec());
		}

	/**
	 * checking boundary conditions a file that doesn't exist
	 */
	@org.junit.jupiter.api.Test
		void FileTest(){
			File file=new File("aa");
			assertNull(Util.getDriveType(file));
		}

	/**
	 * forcing a exception by trying to write when access is denied.
	 */
	@org.junit.jupiter.api.Test
		void  ExceptionTest() throws IOException {
		assertThrows(Exception.class,()->Util.readPhysicalDrive());
	}

	/**
	 * testing performance characteristics by making sure the get method takes very short
	 */
	@org.junit.jupiter.api.Test
	@Timeout(value = 20,unit = TimeUnit.MILLISECONDS)
	void timetest(){
		assertEquals(0,test.getMarkNum());
	}




		}
