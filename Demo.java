package javacodechecker;

public class Demo {
    public void bad() throws Throwable
    {
        int x=0;
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            if(true)
            {
                return;
                
                System.out.println("code issues added");
                
               
            }
        }

    }

    public void bad1() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
                return hello;
              System.out.println("code issue added"); 
            
        }
    }


    private void good1() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            IO.writeLine("In finally block, cleaning up");
        }

    }

    private void good2() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            IO.writeLine("In finally block, cleaning up");
            return;
        }

    }
    public void good3() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            if(true)
            {
             
                return;

            }
        }

    }

}
