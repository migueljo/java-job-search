package com.migueljo.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
	CLIArguments() {

	}

	@Parameter(
					required = true,
					description = "KEYWORD",
					descriptionKey = "KEYWORD"
	)
	private String keyword;
	@Parameter(
					names = {"--location", "-l"},
					descriptionKey = "Cada busqueda puede incluir una ubicación"
	)
	private String location;
	@Parameter(
					names = {"--page", "-p"},
					description = "La API devuelve 50 resultados, usa un número para página"
	)
	private Integer page = 0;
	@Parameter(
					names = {"--fulltime", "-ft"},
					description = "Agregar si queremos trabajos de tiempo completo"
	)
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

	public static CLIArguments newInstance() {
		return new CLIArguments();
	}
}
