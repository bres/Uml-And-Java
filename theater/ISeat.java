package smallApps.theater;

public interface ISeat {
    boolean reserve() throws IsReservedException;
    boolean cancel() throws IsNotReservedException;
}
