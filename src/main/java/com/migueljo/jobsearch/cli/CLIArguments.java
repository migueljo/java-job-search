package com.migueljo.jobsearch.cli;

public class CLIArguments {
	CLIArguments() {

	}

	private String keyword;
	private String location;
	private Integer page = 0;
	private boolean isFullTime = false;
	private boolean isMarkdown = false;
	private boolean isHelp = false;

	public String getKeyword() {
		return keyword;
	}

	public String getLocation() {
		return location;
	}

	public Integer getPage() {
		return page;
	}

	public boolean isFullTime() {
		return isFullTime;
	}

	public boolean isMarkdown() {
		return isMarkdown;
	}

	public boolean isHelp() {
		return isHelp;
	}

	@Override
	public String toString() {
		return "CLIArguments{" +
						"keyword='" + keyword + '\'' +
						", location='" + location + '\'' +
						", page=" + page +
						", isFullTime=" + isFullTime +
						", isMarkdown=" + isMarkdown +
						", isHelp=" + isHelp +
						'}';
	}
}
