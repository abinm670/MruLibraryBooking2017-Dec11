package LibraryRepo;

import java.util.Date;

/**
 * Time slot class.
 * Denotes the start and end time when a Room is either available or is being booked
 *
 */

public class TimeSlot {

    private Date startTime, endTime;

    /**
     *
     * @param startTime : Start time of a slot
     * @param endTime : End time of a slot
     */
    public TimeSlot(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    protected void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    protected void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
