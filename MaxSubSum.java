import java.util.Random;
 
 
public class MaxSubSum {
 
    static private int seqStart = 0;
    static private int seqEnd = -1;
 
    /**
     * Cubic maximum contiguous subsequence sum algorithm.
     * seqStart and seqEnd represent the actual best sequence.
     */
    public static int maxSubSum3( int [ ] a )
    {
        int maxSum = 0;
 
        for( int i = 0; i < a.length; i++ )
            for( int j = i; j < a.length; j++ )
            {
                int thisSum = 0;
 
                for( int k = i; k <= j; k++ )
                    thisSum += a[ k ];
 
                if( thisSum > maxSum )
                {
                    maxSum   = thisSum;
                    seqStart = i;
                    seqEnd   = j;
                }
            }
 
        return maxSum;
    }
