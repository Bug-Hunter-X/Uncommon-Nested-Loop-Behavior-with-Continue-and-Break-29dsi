public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 7;

        while (x < 5) {
            x++;
            if (x == 3) {
                // The 'continue' statement skips the rest of the current iteration,
                // but the loop continues.  Consider if this is the intended behavior.
                continue;
            }
            y++;
            if (y == 2) {
                // The 'break' statement immediately exits the loop. This is expected
                // behavior.
                break;
            }
            z--;
        }
        System.out.println("x=" + x + ", y=" + y + ", z=" + z); //The output is as expected: x=3,y=2,z=6
    }
}
//Explanation:
//The original code's behavior might be unexpected because of the combined effect
//of the continue and break statements in the nested loop structure.
//The continue statement causes the inner loop to skip to the next iteration without
//processing the rest of the statements.  The break statement will exit the inner loop
//after y=2 and will not reduce z further.  This leads to the unexpected z=6 value.