package org.sbe.toto;

import java.util.Objects;

public class Terrain {
    Long superficie;

    public Terrain() {
    }

    public Terrain(Long superficie) {
        this.superficie = superficie;
    }

    public Long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Long superficie) {
        this.superficie = superficie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrain terrain = (Terrain) o;
        return superficie.equals(terrain.superficie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(superficie);
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "superficie=" + superficie +
                '}';
    }
}