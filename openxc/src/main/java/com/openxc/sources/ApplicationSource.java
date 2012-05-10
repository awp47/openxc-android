package com.openxc.sources;

import com.openxc.remote.RawMeasurement;

/**
 * A "reverse" source to pass externally generated measurements to the callback.
 *
 * This class is used by the {@link com.openxc.remote.RemoteVehicleService} to
 * pass measurements received from applications (e.g. from a trace file source
 * in an app) into the normal measurement workflow.
 */
public class ApplicationSource extends BaseVehicleDataSource {
    /**
     * Pass a raw measurement received from an external caller to the callback.
     *
     * Note that this method is public - users of this class can directly force
     * it to send new values.
     */
    public void handleMessage(String measurementId,
            RawMeasurement measurement) {
        handleMessage(measurementId, measurement.getValue(),
                measurement.getEvent());
    }
}
