package org.firstinspires.ftc.teamcode.utils;

import java.lang.annotation.Documented;

@VersionInfo(
        version = "1.0",
        releaseDate = "10/22/2021",
        since = "1.0",
        contributors = {
                "Lorcan Andrew Cheng"
        }
)
@Documented
public @interface VersionInfo
{

    /**
     * Current version when this revision was
     * written.
     *
     * @return Current version
     */
    String version();

    /**
     * Date this revision was written.
     *
     * @return Date of revision
     */
    String releaseDate();

    /**
     * First version this class or function was
     * introduced.
     *
     * @return First introduction of
     * functionality
     */
    String since();

    /**
     * All contributors to this revision.
     *
     * @return All revision contributors
     */
    String[] contributors();

}
