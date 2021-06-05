package project_1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class test01 {

    @Test
    public void ChechWorkingCorrect() throws Exception {
        //Arrange
        int[] expected = {0,0,1,1,2,2};
        int[] nums=  {2,0,2,1,1,0};
        SortColor sut = new SortColor();

        //Act
        int[] actual = sut.sortColors(nums);

        //Assert
        assertThat(actual,is(expected));
    }

    @Test
    public void CheckWorkingCorrectWith0() throws Exception{

        //Arrange
        int[] expected = {0};
        int[] nums=  {0};
        SortColor sut = new SortColor();

        //Act(&Assert)
        int[] actual =  sut.sortColors(nums);

        //Assert
        assertThat(actual,is(expected));
    }

    @Test
    public void CheckWorkingCorrectWith1() throws Exception{
        //Arrange
        SortColor sut = new SortColor();
        int[] expected = {1};
        int[] nums=  {1};

        //Act(&Assert)
        int[]actual sut.sortColors(nums);

        //Assert
        assertThat(actual,is(expected));
    }

    @Test
    public void CheckWorkingCorrectWith2() throws Exception{
        //Arrange
        SortColor sut = new SortColor();
        int[] expected = {2};
        int[] nums=  {2};

        //Act(&Assert)
        int[] actual =  sut.sortColors(nums);

        //Assert
        assertThat(actual,is(expected));
    }

}
