 static CountsBySoH countBatteriesByHealth(int[] presentCapacities) {
    CountsBySoH counts = new CountsBySoH();
    final int ratedCapacity = 120;  
    for (int presentCapacity : presentCapacities) {
        double soh = (100.0 * presentCapacity) / ratedCapacity;

        if (soh > 80) {
            counts.healthy++;
        } else if (soh >= 62) {
            counts.exchange++;
        } else {
            counts.failed++;
        }
    }

    return counts;
}
