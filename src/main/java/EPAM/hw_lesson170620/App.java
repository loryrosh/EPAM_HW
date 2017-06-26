package EPAM.hw_lesson170620;

public class App
{
    public static void main( String[] args )
    {
        int[] arr = { 1, 2, 3 };
        //System.out.println( array123( arr ) );

        int[] nums = { 6, 6, 2, 6 };
        System.out.println( array667( nums ) );
    }

    public static boolean array123(int[] nums) {
        if( nums.length < 3 )
            return false;

        int curIndex = 1;

        for( int i = 0; i < nums.length; i++ ){
            if( nums[i] == curIndex )
                curIndex++;
            else
            {
                curIndex = 1;

                if( nums[i] == 1 )
                    i--;
            }
            if( curIndex == 4 )
                return true;
        }
        return false;
    }

    public static int array667(int[] nums) {
        if( nums.length < 2 )
            return 0;

        int count = 0;
        for( int i = 0; i < nums.length; i++ ){
            if( (i + 1) < nums.length && nums[i] == 6 && ( nums[i + 1] == 6 || nums[i + 1] == 7 ) )
                count++;
        }
        return count;
    }
}
