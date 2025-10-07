public class FitnessTracker {
    private String activity;
    private int minutes;
    private java.time.LocalDate date;

    public FitnessTracker() {
        activity = "running";
        minutes = 0;
        date = java.time.LocalDate.of(java.time.LocalDate.now().getYear(), 1, 1);
    }

     public FitnessTracker(String activity, int minutes, java.time.LocalDate date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

        public String getActivity() {
        return activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public java.time.LocalDate getDate() {
        return date;
    }
}
