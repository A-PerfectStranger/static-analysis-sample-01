FROM mcr.microsoft.com/devcontainers/java:1-17-bullseye

# Fix broken Yarn apt repository key/source before devcontainer features run.
RUN rm -f /etc/apt/sources.list.d/yarn.list \
    && apt-get update \
    && apt-get install -y --no-install-recommends curl ca-certificates gnupg \
    && rm -rf /var/lib/apt/lists/*