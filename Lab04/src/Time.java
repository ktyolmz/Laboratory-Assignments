public class Time implements Comparable<Time> {
	private int seconds, minutes, hours;
	private String period;

	Time() {
		setSeconds(0);
		setMinutes(0);
		setHours(0);
		setPeriod("");
	}

	Time(int seconds, int minutes, int hours, String period) {
		setSeconds(seconds);
		setMinutes(minutes);
		setHours(hours);
		setPeriod(period);
		adjust();
	}

	// t1.add(t2)
	public Time add(Time t) {
		Time tLocal = new Time();
		tLocal.setHours(getHours() + t.getHours());
		tLocal.setMinutes(getMinutes() + t.getMinutes());
		tLocal.setSeconds(getSeconds() + t.getSeconds());
		tLocal.adjust();
		return tLocal;
	}

	private void adjust() {
		if (getSeconds() > 59) {
			int s = getSeconds() % 60;
			int m = getSeconds() / 60;
			setSeconds(s);
			int minutes2 = getMinutes() + m;
			setMinutes(minutes2);
		}
		if (getMinutes() > 59) {
			int min = getMinutes() % 60;
			int h = getMinutes() / 60;
			setMinutes(min);
			setHours(getHours() + h);
		}
		if (getHours() > 12) {
			int h = getHours() % 12;
			setHours(h);
			setPeriod("pm");
		} else if (getHours() < 12) {
			setPeriod("am");
		}
		if (getHours() < 0) {
			setHours(0);
			setPeriod("am");
		} else if (getSeconds() < 0) {
			setSeconds(0);
		} else if (getMinutes() < 0) {
			setMinutes(0);
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

// t1.compareTo(t2)
	@Override
	public int compareTo(Time o) {
		int result = 0;
		if (getPeriod().equals("pm") && o.getPeriod().equals("am")) {
			result = 1;
			return result;
		} else if (getPeriod().equals("am") && o.getPeriod().equals("pm")) {
			result = -1;
			return result;
		} else if (getPeriod().equals(o.getPeriod())) {
			int totalTime = getHours() * 60 * 60 + getMinutes() * 60 + getSeconds();
			int ototalTime = o.getHours() * 60 * 60 + o.getMinutes() * 60 + o.getSeconds();
			if (totalTime > ototalTime) {
				result = 1;
				return result;
			} else if (totalTime < ototalTime) {
				result = -1;
				return result;
			} else if (totalTime == ototalTime) {
				result = 0;
				return result;
			}
		}
		return result;
	}

	public String toString() {
		String writeHours = "" + getHours();
		String writeMinutes = "" + getMinutes();
		String writeSeconds = "" + getSeconds();

		if (getHours() < 10) {
			writeHours = "0" + getHours();
		} else if (getMinutes() < 10) {
			writeMinutes = "0" + getMinutes();
		} else if (getSeconds() < 10) {
			writeSeconds = "0" + getSeconds();
		}
		String write = writeHours + ":" + writeMinutes + ":" + writeSeconds + " " + getPeriod();

		return write;

	}

}