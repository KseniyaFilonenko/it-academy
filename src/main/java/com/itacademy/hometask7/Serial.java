package com.itacademy.hometask7;

import java.util.Objects;

public class Serial extends Object {
    String sort;
    int qtyOfSeasons;
    int qtyOfEpisodes;

    public Serial(String sort, int qtyOfSeasons, int qtyOfEpisodes) {
        this.sort = sort;
        this.qtyOfSeasons = qtyOfSeasons;
        this.qtyOfEpisodes = qtyOfEpisodes;
    }
    @Override
    public boolean equals(Object serial){
        if (this == serial) return true;
        if (serial == null || getClass() != serial.getClass()) return false;

        Serial that = (Serial) serial;

        if (sort != that.sort) return false;
        if (qtyOfSeasons != that.qtyOfSeasons) return false;
        return Objects.equals(qtyOfEpisodes, that.qtyOfEpisodes);
    }
    @Override
    public int hashCode() {
        int result = sort == null ? 0 : sort.hashCode();
        result = 31 * result + qtyOfSeasons;
        result = 31 * result + qtyOfEpisodes;
        return result;
    }
}
