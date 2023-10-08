// Rule 09. Locking (LCK)
// LCK01-J. Do not synchronize on objects that may be reused

private int count = 0;
private final Integer Lock = new Integer(count);
 
public void doSomething() 
{
	synchronized (Lock) 
	{
		count++;
		// ...
	}
}