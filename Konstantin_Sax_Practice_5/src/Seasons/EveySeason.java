package Seasons;

public enum EveySeason {
    Winter (-16, 49),
    Spring (14, 55),
    Summer (29, 20),
    Autumn (7, 64);

    private final int avg_temp;
    private final int avg_prec;

    EveySeason(int avg_temp, int avg_prec) {
        this.avg_temp = avg_temp;
        this.avg_prec = avg_prec;
    }

    public int getAvg_temp() {
        return avg_temp;
    }

    public int getAvg_prec() {
        return avg_prec;
    }

    public String getDescription() {
        if (this == EveySeason.Autumn || this == EveySeason.Winter) {
            return "Холодное время года";
        } else if (this == EveySeason.Spring || this == EveySeason.Summer) {
            return "Тёплое время года";
        } else {
            return "error";
        }
    }

    @Override
    public String toString() {
        return this.name() + ": Среднее количество осадков: " + avg_prec +
                " мм, Средняя температура: " + avg_temp + "°C";
    }
}