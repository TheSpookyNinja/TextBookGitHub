
public interface Lockable
{
    public int setKey();
    public int lock(int masterKey);
    public int unlock(int masterKey);
    public boolean locked();
}
