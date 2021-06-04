package project_1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class test01 {

    @Test
    public void ChechWorkingCorrect() throws Exception {
        SortColor sut = new SortColor();
        int[] expected = {0,0,1,1,2,2};
        int[] nums=  {2,0,2,1,1,0};
        int[] actual =  sut.sortColors(nums);
        assertThat(actual,is(expected));
    }

    @Test
    public void CheckWorkingCorrectWith0() throws Exception{
        SortColor sut = new SortColor();
        int[] expected = {0};
        int[] nums=  {0};
        int[] actual =  sut.sortColors(nums);
        assertThat(actual,is(expected));
    }

    @Test
    public void CheckWorkingCorrectWith1() throws Exception{
        SortColor sut = new SortColor();
        int[] expected = {1};
        int[] nums=  {1};
        int[] actual =  sut.sortColors(nums);
        assertThat(actual,is(expected));
    }

    @Test
    public void CheckWorkingCorrectWith2() throws Exception{
        SortColor sut = new SortColor();
        int[] expected = {2};
        int[] nums=  {2};
        int[] actual =  sut.sortColors(nums);
        assertThat(actual,is(expected));
    }

}
